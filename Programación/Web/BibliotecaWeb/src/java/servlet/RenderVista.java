/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import jakarta.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Multi
 */
public class RenderVista{
    public static void renderVista(HttpServletResponse response, String templateNameconContext, Object datos) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Buscamos la plantilla en la carpeta de recursos de la web
        String path = templateNameconContext;
        try {
            // Creamos una fábrica de Mustache
            MustacheFactory mf = new DefaultMustacheFactory();
            // Compilamos la plantilla desde el archivo
            Mustache mustache = mf.compile(new FileReader(path),templateNameconContext);
            // Ejecutamos la plantilla con los datos
            mustache.execute(response.getWriter(), datos);
        } catch (Exception e) {
            response.getWriter().println("Error: No se pudo renderizarla plantilla " + templateNameconContext);
            e.printStackTrace(response.getWriter());
        }
    }
}