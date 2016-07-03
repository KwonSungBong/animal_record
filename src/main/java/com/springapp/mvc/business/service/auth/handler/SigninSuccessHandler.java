package com.springapp.mvc.business.service.auth.handler;

import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class SigninSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    /*@Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth) throws IOException, ServletException {

        String accept = request.getHeader("accept");

        if( StringUtils.indexOf(accept, "html") > -1 ) {
            super.onAuthenticationSuccess(request, response, auth);

        } else if( StringUtils.indexOf(accept, "xml") > -1 ) {
            response.setContentType("application/xml");
            response.setCharacterEncoding("utf-8");

            String data = StringUtils.join(new String[] {
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
                    "<response>",
                    "<error>false</error>",
                    "<message>�α����Ͽ����ϴ�.</message>",
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
                    " \"error\" : false , ",
                    " \"message\" : \"�α����Ͽ����ϴ�.\" ",
                    "} } "
            });

            PrintWriter out = response.getWriter();
            out.print(data);
            out.flush();
            out.close();
        }
    }*/
}
