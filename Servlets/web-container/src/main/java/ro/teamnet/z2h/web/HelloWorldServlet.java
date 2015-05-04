/**
 * HelloWorldServlet.java
 *
 * Copyright (c) 2014 Teamnet. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 **/

package ro.teamnet.z2h.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Hello World Servlet expose get method to say hello
 * to input user
 */
//servlet-clasa java: extinde functionalitatea de pe server;asigurA COMUNICAREA intre client si server
    //clasele le pot vedea in Java Servlet HTTP-> folosim HttpServlet
    //trebuie initializat in metoda init()-> set up; deschide conexiuni catre o baza de date
    //se apeleaza met service()-> cate o data pt fiecare request;
    //met destroy()-> serverul nu mai are nev de servlet-ul resp;
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.setContentType("text/html");
        resp.getWriter().write("Hello <b>"+req.getParameter("user")+"</b>");
    } // metoda get-pentru a extrage date; nu se trimit f multe info pe server; direct din url

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    } //met post-mult mai multe informatii trebuiesc trimise; prin get-mai putine info; info din body-ul;
    //contenttype: daca vreau sa printez documentul de tip excel; ex-de deschis cu adobe reader;

//suprascriem metodele-mai sus;
}
