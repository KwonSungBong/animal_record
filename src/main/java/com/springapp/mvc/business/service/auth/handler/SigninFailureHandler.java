package com.springapp.mvc.business.service.auth.handler;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class SigninFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    /*public static String DEFAULT_TARGET_PARAMETER = "spring-security-redirect-login-failure";
    private String targetUrlParameter = DEFAULT_TARGET_PARAMETER;
    public String getTargetUrlParameter() {
        return targetUrlParameter;
    }

    public void setTargetUrlParameter(String targetUrlParameter) {
        this.targetUrlParameter = targetUrlParameter;
    }*/

    /*@Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        String accept = request.getHeader("accept");
        String error = "true";
        if( StringUtils.indexOf(accept, "html") > -1 ) {

            String redirectUrl = request.getParameter(this.targetUrlParameter);
            if (redirectUrl != null) {
                super.logger.debug("Found redirect URL: " + redirectUrl);
                getRedirectStrategy().sendRedirect(request, response, redirectUrl);
            } else {
                super.onAuthenticationFailure(request, response, exception);
            }

        } else if( StringUtils.indexOf(accept, "xml") > -1 ) {
            response.setContentType("application/xml");
            response.setCharacterEncoding("utf-8");

            String data = StringUtils.join(new String[] {
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
                    "<response>",
                    "<error>" , error , "</error>",
                    "<message>" , exception.getMessage() , "</message>",
                    "</response>"
            });

            PrintWriter out = response.getWriter();
            out.print(data);
            out.flush();
            out.close();

        } else if( StringUtils.indexOf(accept, "json") > -1 ) {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");

            String data = StringUtils.join(new String[] {
                    " { \"response\" : {",
                    " \"error\" : " , error , ", ",
                    " \"message\" : \"", exception.getMessage() , "\" ",
                    "} } "
            });

            PrintWriter out = response.getWriter();
            out.print(data);
            out.flush();
            out.close();

        }
    }*/

}
