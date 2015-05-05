/**
 * HeadersLogFilter.java
 *
 * Copyright (c) 2014 Teamnet. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 **/

package ro.teamnet.zth.web;

import ro.teamnet.zth.file.LogFileWriter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class HeadersLogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * This filter  logs current request headers to filesystem
     * @param request - Client request
     * @param response - Client response
     * @param chain - Filters chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

       Enumeration<String> enumeration=  request.getParameterNames();
        while(enumeration.hasMoreElements())
        {String header=enumeration.nextElement();
            LogFileWriter.logHeader(header,request.getParameter(header));

        }
       //TODO completeaza cu cod astfel incat sa poti loga headerele de pe request intr-un fisier.
       // Clasa care va scrie intr-un fisier de log este LogFileWriter metoda   logHeader

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
