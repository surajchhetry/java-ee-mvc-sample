<div id="mySidenav" class="sidenav" style="width:225px">
    <div id="accordion" style="cursor: pointer;">
        <div>
            <div id="headingOne">
                        <span class="mb-0">
                                    <a href="${mvc.basePath}/home">
                                        <i class="fa fa-home"></i>
                                        <span class="subnam">Home</span>
                                    </a>
                        </span>
            </div>
        </div>
        <div>
            <div id="headingTwo">
                        <span class="mb-0">
                            <a class="collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true"
                               aria-controls="collapseTwo" href="#">
                                <i class="fa fa-user"></i> 
                                <span class="sdnam">User Mangement</span>
                            </a>
                        </span>
            </div>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                <div class="submenu">
                    <a href="${mvc.basePath}/users/new">
                        <i class="fa fa-plus"></i>
                        <span class="subnam">Add</span>
                    </a>
                </div>
                <div class="submenu">
                    <a href="${mvc.basePath}/users">
                        <i class="fa fa-search"></i>
                        <span class="subnam">Search</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<script>

    function nav() {

        navSize = document.getElementById("mySidenav").style.width;
        console.log(navSize);
        if (navSize === '0px') {
            return openNav();
        }
        return closeNav();

    }

    function openNav() {
        document.getElementById("mySidenav").style.width = "225px";
        //  document.getElementById("main").style.marginLeft = "250px";
        document.getElementById("container").style.marginLeft = "240px";
        document.getElementById("mySidenav").style.display = "block";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
        document.getElementById("mySidenav").style.transition = "0.2s";
        document.getElementById("mySidenav").style.display = "none";
        //   document.getElementById("main").style.marginLeft = "0";
        document.getElementById("container").style.marginLeft = "18px";
    }
</script>
