<% if(comment) { %>
<!-- ${comment.encodeAsHTML()} -->
<% } %>
<li class="dropdown ${liClass}">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
        <i class="fa ${faIcon}"></i>
        <span class="label ${label}">${number ?: '0'}</span>
    </a>
</li>
