package celcord.jaxb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.s9api.*;

//import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

//import carsXmlGradle1.Car;
//import carsXmlGradle1.MainClass1.Log;

public class ReadXmlDemo2 {
	//static final String srcXML = "xml/outnewschema.messier.xml";
	static final String srcXML = "xml/outnewschema.stars.xml";
	
	public static void main(String[] args) {
		// test xmlStrToClassInstance
		Root2.SkyobjColl root2List = xmlStrToObj(Root2.SkyobjColl.class, fileToString(srcXML));
		String outpt = "";  int ct = 0;
		for (Root2.Skyobj skyObj : root2List.getSkyObjList()) {
			outpt += ct++ + "..: " + skyObj.name + "/" + skyObj.messier_num + "/" + skyObj.getDecl() + ", ";}
		Log.d("gg", "testing xmlStrToClassInstance... " + root2List.getSkyObjList().size() + "\n" + outpt);
		
		String xmlInString = fileToString(srcXML);
		Processor saxonProcessor = new Processor(false);
		XdmNode inputSaxonNode = null;
		try {
			inputSaxonNode = saxonProcessor.newDocumentBuilder().build(
				new StreamSource(new StringReader(xmlInString)));
		} catch (SaxonApiException e) {
			e.printStackTrace();
		}
		
		String xformedString = doSaxonXSLT(inputSaxonNode, fileToString("xml/sortByName.xsl"), saxonProcessor);
		Log.d("gg", "ZZZyvv " + xformedString);
		Object returnObj = null;
//		try {
//			XmlMapper mapr = new XmlMapper();
//			returnObj = mapr.readValue(xmlStr, targetClass);
//			return returnObj;
//		} catch (Exception e) {
//			Log.d("gg", e.toString());
//		}
		Log.d("gg", "all done");
	} 
	
	public static String doSaxonXSLT(XdmNode inputSaxonNode, String xsltStr, Processor saxonProcessor) {
		try { 
			// saxonProcessor must be the same instance of saxonProcessor which produced input node.
		    XsltExecutable saxonCompiledXSLT = saxonProcessor.newXsltCompiler()
		    		.compile(new StreamSource(new StringReader(xsltStr)));
			// Serializer out = new Serializer(); doesnt work from example .. replace below..
			Serializer saxonSerializer_XSLT_dest = saxonProcessor.newSerializer();
			saxonSerializer_XSLT_dest.setOutputProperty(Serializer.Property.METHOD, "html");
			saxonSerializer_XSLT_dest.setOutputProperty(Serializer.Property.INDENT, "yes");
			ByteArrayOutputStream serializedByteStr = new ByteArrayOutputStream();
			saxonSerializer_XSLT_dest.setOutputStream(serializedByteStr);
			XsltTransformer xsltTransformer = saxonCompiledXSLT.load();
			xsltTransformer.setInitialContextNode(inputSaxonNode);
			xsltTransformer.setDestination(saxonSerializer_XSLT_dest);
			xsltTransformer.transform();
			return serializedByteStr.toString();
		} catch (SaxonApiException e) {
			Log.d("gg", "error: " + e.getStackTrace());
			return null;
		}
	}
	
	/**
	 * 
	 * @param <DestClass> class which is to be instantiated and populated with xmlStr
	 * @param destClass
	 * @param xmlStr
	 * @return
	 * example: Root2.SkyobjColl root2List = 
	 * 					xmlStrToClassInstance(Root2.SkyobjColl.class, fileToString(srcXML));
	 */
	public static <DestClass> DestClass 
						xmlStrToObj(Class<DestClass> destClass, String xmlStr) {
		XmlMapper jacksonXmlMapper = new XmlMapper();
		try {
			net.sf.saxon.s9api.Processor proc;
			Object destinationObjectForXmlString = null;
			try {
				XmlMapper mapr = new XmlMapper();
				destinationObjectForXmlString = mapr.readValue(xmlStr, destClass);
			} catch (Exception e) {
				Log.d("gg", e.toString());
			}
			DestClass returnTypedObj = (DestClass)destinationObjectForXmlString;
			return returnTypedObj;
		} catch (Exception e) {
			Log.d("gg", e.toString());
			e.printStackTrace();
			return null;
		}
	}

	public static String fileToString(String fpath) {
			StringBuilder stringLineBuilder = new StringBuilder();
			try (Stream<String> stream = Files.lines(Paths.get(fpath), StandardCharsets.UTF_8)) {
				// stream has iterator of each line. s is string which gets appended.
				stream.forEach(s -> {
					stringLineBuilder.append(s).append("\n");
				});
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
			return stringLineBuilder.toString();
	}

	// to be compatable with android Log.d()
	public static class Log {
		public static void d(String tag, String str) {
			System.out.println(str);
		}
	}
}
