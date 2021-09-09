

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
        <ul class="list-group category_block">
            <c:forEach items="${listB}" var="p">
                <li class="list-group-item text-white ${tag == p.cid ? "active":""}"><a href="category?cid=${p.cid}">${p.cname}</a></li>
            </c:forEach>

        </ul>
    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase">Newest</div>
        <div class="card-body">
            <img class="img-fluid" src="${newP.image}" />
            <h5 class="card-title">${newP.name}</h5>
            <p class="card-text">${newP.decs}</p>
            <p class="bloc_left_price">${newP.price} đ</p>
        </div>
    </div>
</div>