<?xml version="1.0" encoding="ISO-8859-1" standalone="no"?>
<!DOCTYPE helpset PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN"
"http://java.sun.com/products/javahelp/helpset_2_0.dtd">
<helpset version="2.0">
    <title>Uso de Java Help</title>
    <maps>
        <homeID>index</homeID>
        <mapref location="map.jhm"/>
    </maps>
    <view xml:lang="es" mergetype="javax.help.UniteAppendMerge">
        <name>TOC</name>
        <label>Tabla de contenidos</label>
        <type>javax.help.TOCView</type>
        <data>TOC.xml</data>
    </view>
    <view xml:lang="es" mergetype="javax.help.SortMerge">
        <name>Index</name>
        <label>Indice</label>
        <type>javax.help.IndexView</type>
        <data>index.xml</data>
    </view>
    <view xml:lang="es">
        <name>Buscar</name>
        <label>Buscar</label>
        <type>javax.help.SearchView</type>
        <data engine="com.sun.java.help.search.DefaultSearchEngine">JavaHelpSearch</data>
    </view>

</helpset>
