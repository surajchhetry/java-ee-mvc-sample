<div id="main">
    <nav class="navbar navbar-expand-lg navbar-dark header-color">
        <a class="navbar-brand" href="#">JAVA EE</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse nav-toggle" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto ">
                <li><span onclick="nav()">&#9776 </span></li>
            </ul>

        </div>
        <button type="button" class="btn admin-btn">
            <span>admin</span>
        </button>

        <a type="button" class="btn logout-btn" href="${mvc.contextPath}">
            <span><i class="fa fa-power-off logout"></i></span>
        </a>
    </nav>
</div>
