/*
 * BooleanValue.java
 *
 * This work is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * This work is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 *
 * As a special exception, the copyright holders of this library give
 * you permission to link this library with independent modules to
 * produce an executable, regardless of the license terms of these
 * independent modules, and to copy and distribute the resulting
 * executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the
 * license of that module. An independent module is a module which is
 * not derived from or based on this library. If you modify this
 * library, you may extend this exception to your version of the
 * library, but you are not obligated to do so. If you do not wish to
 * do so, delete this exception statement from your version.
 *
 * Copyright (c) 2003 Per Cederberg. All rights reserved.
 */

package net.percederberg.mibble.value;

import net.percederberg.mibble.MibLoaderLog;
import net.percederberg.mibble.MibValue;

/**
 * A boolean MIB value.
 *
 * @author   Per Cederberg, <per at percederberg dot net>
 * @version  2.0
 * @since    2.0
 */
public class BooleanValue implements MibValue {

    /**
     * The boolean true value.
     */
    public static final BooleanValue TRUE = new BooleanValue(true);

    /**
     * The boolean false value.
     */
    public static final BooleanValue FALSE = new BooleanValue(false);

    /**
     * The underlying boolean value.
     */
    private boolean value;
    
    /**
     * Creates a new boolean MIB value. 
     * 
     * @param value          the boolean value
     */
    private BooleanValue(boolean value) {
        this.value = value;
    }

    /**
     * Initializes the MIB value. This will remove all levels of
     * indirection present, such as references to other values, and 
     * returns the basic value. No value information is lost by this 
     * operation. This method may modify this object as a 
     * side-effect, and will be called by the MIB loader.
     * 
     * @param log            the MIB loader log
     * 
     * @return the basic MIB value
     */
    public MibValue initialize(MibLoaderLog log) {
        return this; 
    }

    /**
     * Returns a Java Boolean representation of this value.
     * 
     * @return a Java Boolean representation of this value
     */
    public Object toObject() {
        return new Boolean(value);
    }
    
    /**
     * Returns a string representation of this value.
     * 
     * @return a string representation of this value
     */
    public String toString() {
        return value ? "TRUE" : "FALSE";
    }
}