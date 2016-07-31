<%-- 
    Document   : listaMusicaJson
    Created on : 31-lug-2016, 23.16.53
    Author     : Pili
--%>

<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<json:array>
    <c:forEach var="album" items="${listaMusica}">
        <json:object>
            <json:property name="codice" value="${album.getCodice()}"/>
            <json:property name="nome" value="${album.getNomeOgg()}"/>
            <json:property name="coverLink" value="${album.getCoverLink()}"/>
            <json:property name="autore" value="${album.getAutore()}"/>
            <json:property name="tipo" value="${album.getTipo()}"/>
            <json:property name="prezzo" value="${album.getTipo()}"/>
    </c:forEach>
</json:array>
