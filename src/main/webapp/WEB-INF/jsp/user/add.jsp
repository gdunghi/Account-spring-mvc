  <jsp:include page="../decorator/header.jsp" /> 
 <div class="col-md-4" style="margin: 20px">
    <form role="form" method="post" action="/user/save">
        <div class="form-group">
            <label for="exampleInputEmail11">Name</label>
            <input name="name" type="text" class="form-control" id="name">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail12">Last Name</label>
            <input name="lastName" type="text" class="form-control" id="lastName" >
        </div> 

        <button style="float: right" type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
  <jsp:include page="../decorator/header.jsp" /> 