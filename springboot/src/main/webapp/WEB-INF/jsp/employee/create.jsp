<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<h1>Create Employee!</h1>

<section>
      <div class="container">
        <form method="get" action = "/employee/createSubmit" >
        <input type="hidden" name ="id" value="${form.id}">
            <div class="mt-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" value="${form.firstName}" aria-describedby="firstNameHelp">
                <div id="firstNameHelp" class="form-text">Please let us know your first name.</div>
            </div>
            <c:if test="${errors.hasFieldErrors('firstName')}">
                       <div style="color:red">
                            <c:forEach items="${errors.getFieldErrors('firstName')}" var="error">
                                     ${error.defaultMessage}<br>
                             </c:forEach>
                       </div>
            </c:if>
            <div class="mt-3">
                    <label for="lastName" class="form-label">Last Name</label>
                    <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}" >
            </div>
            <c:if test="${errors.hasFieldErrors('lastName')}">
                       <div style="color:red">
                             <c:forEach items="${errors.getFieldErrors('lastName')}" var="error">
                                        ${error.defaultMessage}<br>
                             </c:forEach>
                       </div>
            </c:if>


            <div class="mt-3">
                   <label for="departmentName" class="form-label">Department Name</label>
                   <input type="text" class="form-control" id="departmentName" name="departmentName" value="${form.departmentName}">
                   </div>
                   <c:if test="${errors.hasFieldErrors('departmentName')}">
                           <div style="color:red">
                                 <c:forEach items="${errors.getFieldErrors('lastName')}" var="error">
                                       ${error.defaultMessage}<br>
                                 </c:forEach>
                           </div>
                   </c:if>



            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>
