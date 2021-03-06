<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="home">Electro</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <c:if test="${sessionScope.acc.isAdmin == true}">                   
                <li class="nav-item">
                    <a class="nav-link" href="#">Hello Admin</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="manager">Manager Product</a>
                </li>
                
                </c:if>
                <c:if test="${sessionScope.acc != null}">
                    <li class="nav-item">
                    <a class="nav-link" href="logout">Logout</a>                    
                    </li>
                    <c:if test="${sessionScope.acc.isAdmin == false}">
                     <li class="nav-item">
                    <a class="nav-link" href="#">Hello User</a>
                </li>   
                    </c:if>
                </c:if>
                <c:if test="${sessionScope.acc == null}">
                <li class="nav-item">
                    <a class="nav-link" href="login">Login</a>
                </li>
                </c:if>
                
            </ul>

            <form action="search" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="show">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light"></span>
                </a>
            </form>
        </div>
    </div>
</nav>
<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading" style="color: black">Electro</h1>
        <p class="lead text-muted mb-0">C???a h??ng linh ki???n ??i???n t??? "KH??NG" uy t??n nh???t th??? gi???i</p>
    </div>
</section>
<!--end of menu-->
