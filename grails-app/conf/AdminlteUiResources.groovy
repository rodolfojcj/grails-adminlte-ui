// resource declarations for Resources plugin
modules = {
  'adminlte-core' {
    dependsOn 'adminlte-deps'
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css', file: 'AdminLTE.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/AdminLTE', file: 'app.js']
  }

  'adminlte-deps' {
    dependsOn 'jquery' // TODO: it has to be at least 2.0.2
    dependsOn 'jquery-ui'
    //dependsOn 'bootstrap' // requires a fix in Config.groovy for g:paginate and seems to do more than needed
    // AdminLTE uses Twitter Bootstrap 3.0.2 originally
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css', file: 'bootstrap.min.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js', file: 'bootstrap.min.js']
    //dependsOn 'font-awesome' // didn't work :(
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css', file: 'font-awesome.min.css'] // and the fonts files??
    //
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css', file: 'ionicons.min.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css/morris', file: 'morris.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css/jvectormap', file: 'jquery-jvectormap-1.2.2.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css/datepicker', file: 'datepicker3.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css/daterangepicker', file: 'daterangepicker-bs3.css']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/css/bootstrap-wysihtml5', file: 'bootstrap3-wysihtml5.min.css']
    //
    resource url: 'http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js'
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/morris', file: 'morris.min.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/sparkline', file: 'jquery.sparkline.min.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/jvectormap', file: 'jquery-jvectormap-1.2.2.min.js']
    // TODO: jquery-jvectormap-world-mill-[other-custom-locale].js ???
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/jvectormap', file: 'jquery-jvectormap-world-mill-en.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/jqueryKnob', file: 'jquery.knob.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/daterangepicker', file: 'daterangepicker.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/datepicker', file: 'bootstrap-datepicker.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/bootstrap-wysihtml5', file: 'bootstrap3-wysihtml5.all.min.js']
    resource url: [plugin: 'adminlte-ui', dir: 'AdminLTE/js/plugins/iCheck', file: 'icheck.min.js']
  }
}
// TODO: review and solve the following fragments
/*
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
*/
/*
        <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <!-- jQuery UI 1.10.3 -->
        <script src="js/jquery-ui-1.10.3.min.js" type="text/javascript"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="js/AdminLTE/dashboard.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>
*/
