/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexception.exceptions;

/**
 *
 * @author User
 */
public class ej2exception extends Exception {

    /**
     * Creates a new instance of <code>ej2exception</code> without detail
     * message.
     */
    public ej2exception() {
    }

    /**
     * Constructs an instance of <code>ej2exception</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ej2exception(String msg) {
        super(msg);
    }
}
