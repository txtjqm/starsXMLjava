<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="XSD">
      <schema location="../celCordStd.xsd"/>
      <rootElement name="root" namespace="http://celCordStd"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="XSD">
      <schema location="../celCordStd.xsd"/>
      <rootElement name="root" namespace="http://celCordStd"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.7.0(build 130301.0647.0008) AT [TUE MAR 10 14:25:25 EDT 2020]. -->
?>
<xsl:stylesheet version="1.0"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:ns0="http://celCordStd"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl xsd ns0 mhdr oraext bpm xp20 hwf xref socket ora dvm bpws xdk ids med bpel ldap">
  <xsl:template match="/">
    <ns0:root xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xmlns="http://celCordStd"
          xsi:schemaLocation="http://celCordStd ../celCordStd.xsd">
      <xsl:for-each select="/ns0:root/ns0:skyobj">
        <xsl:sort select="ns0:name" />
        <ns0:skyobj>
          <xsl:if test="@skyType">
            <xsl:attribute name="skyType">
              <xsl:value-of select="@skyType"/>
            </xsl:attribute>
          </xsl:if>
          <ns0:name>
            <xsl:value-of select="ns0:name"/>
          </ns0:name>
          <xsl:if test="ns0:magnitude">
            <ns0:magnitude>
              <xsl:value-of select="ns0:magnitude"/>
            </ns0:magnitude>
          </xsl:if>
          <xsl:if test="ns0:star_bayer_Name">
            <ns0:star_bayer_Name>
              <xsl:value-of select="ns0:star_bayer_Name"/>
            </ns0:star_bayer_Name>
          </xsl:if>
          <xsl:if test="ns0:star_rank">
            <ns0:star_rank>
              <xsl:value-of select="ns0:star_rank"/>
            </ns0:star_rank>
          </xsl:if>
          <xsl:if test="ns0:messier_num">
            <ns0:messier_num>
              <xsl:value-of select="ns0:messier_num"/>
            </ns0:messier_num>
          </xsl:if>
          <xsl:if test="ns0:ngc_num">
            <ns0:ngc_num>
              <xsl:value-of select="ns0:ngc_num"/>
            </ns0:ngc_num>
          </xsl:if>
          <xsl:if test="ns0:messier_type">
            <ns0:messier_type>
              <xsl:value-of select="ns0:messier_type"/>
            </ns0:messier_type>
          </xsl:if>
          <xsl:if test="ns0:dist_kly">
            <ns0:dist_kly>
              <xsl:value-of select="ns0:dist_kly"/>
            </ns0:dist_kly>
          </xsl:if>
          <xsl:if test="ns0:dist_ly">
            <ns0:dist_ly>
              <xsl:value-of select="ns0:dist_ly"/>
            </ns0:dist_ly>
          </xsl:if>
          <xsl:if test="ns0:ra">
            <ns0:ra>
              <xsl:value-of select="ns0:ra"/>
            </ns0:ra>
          </xsl:if>
          <xsl:if test="ns0:decl">
            <ns0:decl>
              <xsl:value-of select="ns0:decl"/>
            </ns0:decl>
          </xsl:if>
          <ns0:celestCordParsed>
            <ns0:raHour>
              <xsl:value-of select="ns0:celestCordParsed/ns0:raHour"/>
            </ns0:raHour>
            <ns0:raMin>
              <xsl:value-of select="ns0:celestCordParsed/ns0:raMin"/>
            </ns0:raMin>
            <ns0:raSec>
              <xsl:value-of select="ns0:celestCordParsed/ns0:raSec"/>
            </ns0:raSec>
            <ns0:declDegr>
              <xsl:value-of select="ns0:celestCordParsed/ns0:declDegr"/>
            </ns0:declDegr>
            <ns0:declMin>
              <xsl:value-of select="ns0:celestCordParsed/ns0:declMin"/>
            </ns0:declMin>
            <ns0:declSec>
              <xsl:value-of select="ns0:celestCordParsed/ns0:declSec"/>
            </ns0:declSec>
          </ns0:celestCordParsed>
        </ns0:skyobj>
      </xsl:for-each>
    </ns0:root>
  </xsl:template>
</xsl:stylesheet>