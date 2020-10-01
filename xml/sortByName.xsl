<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                >
                <!--  Â is ascii 194 or &#194; hex C2 -->
  <xsl:template match="/">
    <SkyobjColl>
      <skyObjList>
        <xsl:for-each select="/SkyobjColl/skyObjList/skyobj">
<!--           <xsl:sort select="name" /> -->
          <xsl:sort select="magnitude" />
          <skyobj>
            <xsl:if test="@skyType">
              <xsl:attribute name="skyType">
                <xsl:value-of select="@skyType"/>
              </xsl:attribute>
            </xsl:if>
            <name>
              <xsl:value-of select="name"/>
            </name>
            <magnitude>
              <xsl:value-of select="magnitude"/>
            </magnitude>
            <messier_num>
              <xsl:value-of select="messier_num"/>
            </messier_num>
            <ngc_num>
              <xsl:value-of select="ngc_num"/>
            </ngc_num>
            <messier_type>
              <xsl:value-of select="messier_type"/>
            </messier_type>
            <dist_kly>
              <xsl:value-of select="dist_kly"/>
            </dist_kly>
            <dist_ly>
              <xsl:value-of select="dist_ly"/>
            </dist_ly>
            <ra>
              <xsl:value-of select="ra"/>
            </ra>
            <decl>
              <!--  <xsl:value-of select="decl"/> -->
              <xsl:value-of select="replace(decl,'[&#xB0;]','')"/><!-- &#xB0; is hex notation for degree sign -->
              
            </decl>
            <celestCordParsed>
              <raHour>
                <xsl:value-of select="celestCordParsed/raHour"/>
              </raHour>
              <raMin>
                <xsl:value-of select="celestCordParsed/raMin"/>
              </raMin>
              <raSec>
                <xsl:value-of select="celestCordParsed/raSec"/>
              </raSec>
              <declDegr>
                <xsl:value-of select="celestCordParsed/declDegr"/>
              </declDegr>
              <declMin>
                <xsl:value-of select="celestCordParsed/declMin"/>
              </declMin>
              <declSec>
                <xsl:value-of select="celestCordParsed/declSec"/>
              </declSec>
            </celestCordParsed>
          </skyobj>
        </xsl:for-each>
      </skyObjList>
    </SkyobjColl>
  </xsl:template>
</xsl:stylesheet>
