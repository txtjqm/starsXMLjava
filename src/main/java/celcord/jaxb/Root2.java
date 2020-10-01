package celcord.jaxb;
import java.util.ArrayList;
import java.util.List;

// added
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

// substitute in notepad++    
//  \@.*      \/\*\*      \s\*.*
//   edit->line operations->remove empty lines (containing blank characters)

public class Root2 {
	public static class SkyobjColl {
    	// public SkyobjColl() {}
    	private List<Root2.Skyobj> skyObjList;
		public List<Root2.Skyobj> getSkyObjList() {
			return skyObjList;
		}
		protected void setSkyObjList(List<Root2.Skyobj> skyObjList) {
			this.skyObjList = skyObjList;
		}
    }
    protected List<Root2.Skyobj> skyobj;
    protected String xsi;
    protected String schemaLocation;
    public List<Root2.Skyobj> getSkyobj() {
        if (skyobj == null) {
            skyobj = new ArrayList<Root2.Skyobj>();
        }
        return this.skyobj;
    }
    public String getXsi() {
        return xsi;
    }
    public void setXsi(String value) {
        this.xsi = value;
    }
    public String getSchemaLocation() {
        return schemaLocation;
    }
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
    }
    
    @JacksonXmlRootElement (localName = "skyobj")
    public static class Skyobj {
        protected String name;
        protected Float magnitude;
        protected String star_bayer_Name;
        protected Float star_rank;
        protected String messier_num; // toplink makes messier_num into messierNum and messes up xml intake
        protected String ngc_num;
        protected String messier_type; // changes from camelcase
        protected String dist_kly;
        protected Float dist_ly;
        protected String ra;
        protected String decl;
        protected Root2.Skyobj.CelestCordParsed celestCordParsed;
        protected SkyTypeT skyType;
        public String getName() {
            return name;
        }
        public void setName(String value) {
            this.name = value;
        }
        public Float getMagnitude() {
            return magnitude;
        }
        public void setMagnitude(Float value) {
            this.magnitude = value;
        }
        public String getStar_bayer_Name() {
            return star_bayer_Name;
        }
        public void setStar_bayer_Name(String value) {
            this.star_bayer_Name = value;
        }
        public Float getStar_rank() {
            return star_rank;
        }
        public void setStar_rank(Float value) {
            this.star_rank = value;
        }
        public String getMessier_num() {
            return messier_num;
        }
        public void setMessier_num(String value) {
            this.messier_num = value;
        }
        public String getNgc_num() {
            return ngc_num;
        }
        public void setNgc_num(String value) {
            this.ngc_num = value;
        }
        public String getMessier_type() {
            return messier_type;
        }
        public void setMessier_type(String value) {
            this.messier_type = value;
        }
        public String getDist_kly() {
            return dist_kly;
        }
        public void setDist_kly(String value) {
            this.dist_kly = value;
        }
        public Float getDist_ly() {
            return dist_ly;
        }
        public void setDist_ly(Float value) {
            this.dist_ly = value;
        }
        public String getRa() {
            return ra;
        }
        public void setRa(String value) {
            this.ra = value;
        }
        public String getDecl() {
            return decl;
        }
        public void setDecl(String value) {
            this.decl = value;
        }
        public Root2.Skyobj.CelestCordParsed getCelestCordParsed() {
            return celestCordParsed;
        }
        public void setCelestCordParsed(Root2.Skyobj.CelestCordParsed value) {
            this.celestCordParsed = value;
        }
        public SkyTypeT getSkyType() {
            return skyType;
        }
        public void setSkyType(SkyTypeT value) {
            this.skyType = value;
        }

        public static class CelestCordParsed {
            protected float raHour;
            protected float raMin;
            protected float raSec;
            protected float declDegr;
            protected float declMin;
            protected float declSec;
            public float getRaHour() {
                return raHour;
            }
            public void setRaHour(float value) {
                this.raHour = value;
            }
            public float getRaMin() {
                return raMin;
            }
            public void setRaMin(float value) {
                this.raMin = value;
            }
            public float getRaSec() {
                return raSec;
            }
            public void setRaSec(float value) {
                this.raSec = value;
            }
            public float getDeclDegr() {
                return declDegr;
            }
            public void setDeclDegr(float value) {
                this.declDegr = value;
            }
            public float getDeclMin() {
                return declMin;
            }
            public void setDeclMin(float value) {
                this.declMin = value;
            }
            public float getDeclSec() {
                return declSec;
            }
            public void setDeclSec(float value) {
                this.declSec = value;
            }
        }
    }
}