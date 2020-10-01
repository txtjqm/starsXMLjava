
package celcord.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for skyTypeT.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="skyTypeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="messier"/>
 *     &lt;enumeration value="star"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "skyTypeT")
@XmlEnum
public enum SkyTypeT {

    @XmlEnumValue("messier")
    messier("messier"),  // changed decapitalized
    @XmlEnumValue("star")
    star("star");
    private final String value;

    SkyTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkyTypeT fromValue(String v) {
        for (SkyTypeT c : SkyTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
