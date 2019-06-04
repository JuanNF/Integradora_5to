package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class iniciar_005fsesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Inicio</title>\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS File -->\n");
      out.write("  <link href=\"lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Libraries CSS Files -->\n");
      out.write("  <link href=\"lib/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"lib/ionicons/css/ionicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Main Stylesheet File -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- =======================================================\n");
      out.write("    Theme Name: BizPage\n");
      out.write("    Theme URL: https://bootstrapmade.com/bizpage-bootstrap-business-template/\n");
      out.write("    Author: BootstrapMade.com\n");
      out.write("    License: https://bootstrapmade.com/license/\n");
      out.write("  ======================================================= -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--==========================\n");
      out.write("      Contact Section\n");
      out.write("    ============================-->\n");
      out.write("    <section id=\"contact\" class=\"section-bg wow fadeInUp\">\n");
      out.write("        <div class=\"section-header\" >\n");
      out.write("          <h3>Inicia tu Sesion</h3>\n");
      out.write("          <p>Ingresa tu Correo y Contraseña</p>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <div class=\"form\">\n");
      out.write("          <div id=\"errormessage\"></div>\n");
      out.write("          <form action=\"validar\" method=\"post\">\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("              <div class=\"form-group col-md-6\">\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Correo\" data-rule=\"email\" data-msg=\"Ingrese su correo electronico\" />\n");
      out.write("                <div class=\"validation\"></div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group col-md-6\">\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Contraseña\" data-rule=\"minlen:3\" data-msg=\"Ingrese su constraseña\" />\n");
      out.write("                <div class=\"validation\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              <div class=\"text-center\"><input type=\"submit\" value=\"Ingresar\"></div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- #contact -->\n");
      out.write("  </main>\n");
      out.write("\n");
      out.write("  <!--==========================\n");
      out.write("    Footer\n");
      out.write("  ============================-->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-info\">\n");
      out.write("            <h3>BizPage</h3>\n");
      out.write("            <p>Cras fermentum odio eu feugiat lide par naso tierra. Justo eget nada terra videa magna derita valies darta donna mare fermentum iaculis eu non diam phasellus. Scelerisque felis imperdiet proin fermentum leo. Amet volutpat consequat mauris nunc congue.</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("            <h4>Useful Links</h4>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">Home</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">About us</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">Services</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">Terms of service</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">Privacy policy</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-contact\">\n");
      out.write("            <h4>Contact Us</h4>\n");
      out.write("            <p>\n");
      out.write("              A108 Adam Street <br>\n");
      out.write("              New York, NY 535022<br>\n");
      out.write("              United States <br>\n");
      out.write("              <strong>Phone:</strong> +1 5589 55488 55<br>\n");
      out.write("              <strong>Email:</strong> info@example.com<br>\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <div class=\"social-links\">\n");
      out.write("              <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"google-plus\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"linkedin\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-newsletter\">\n");
      out.write("            <h4>Our Newsletter</h4>\n");
      out.write("            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna veniam enim veniam illum dolore legam minim quorum culpa amet magna export quem marada parida nodela caramase seza.</p>\n");
      out.write("            <form action=\"\" method=\"post\">\n");
      out.write("              <input type=\"email\" name=\"email\"><input type=\"submit\"  value=\"Subscribe\">\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong>BizPage</strong>. All Rights Reserved\n");
      out.write("      </div>\n");
      out.write("      <div class=\"credits\">\n");
      out.write("        <!--\n");
      out.write("          All the links in the footer should remain intact.\n");
      out.write("          You can delete the links only if you purchased the pro version.\n");
      out.write("          Licensing information: https://bootstrapmade.com/license/\n");
      out.write("          Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=BizPage\n");
      out.write("        -->\n");
      out.write("        Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer><!-- #footer -->\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("  <!-- Uncomment below i you want to use a preloader -->\n");
      out.write("  <!-- <div id=\"preloader\"></div> -->\n");
      out.write("\n");
      out.write("  <!-- JavaScript Libraries -->\n");
      out.write("  <script src=\"lib/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"lib/jquery/jquery-migrate.min.js\"></script>\n");
      out.write("  <script src=\"lib/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("  <script src=\"lib/superfish/hoverIntent.js\"></script>\n");
      out.write("  <script src=\"lib/superfish/superfish.min.js\"></script>\n");
      out.write("  <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("  <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("  <script src=\"lib/counterup/counterup.min.js\"></script>\n");
      out.write("  <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"lib/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("  <script src=\"lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("  <script src=\"lib/touchSwipe/jquery.touchSwipe.min.js\"></script>\n");
      out.write("  <!-- Contact Form JavaScript File -->\n");
      out.write("  <script src=\"contactform/contactform.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main Javascript File -->\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
