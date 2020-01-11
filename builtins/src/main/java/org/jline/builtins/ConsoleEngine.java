/*
 * Copyright (c) 2002-2020, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * https://opensource.org/licenses/BSD-3-Clause
 */
package org.jline.builtins;

import org.jline.builtins.CommandRegistry;
import org.jline.reader.ParsedLine;

public interface ConsoleEngine extends CommandRegistry {
    
    void setMasterRegistry(SystemRegistry masterRegistry);
    
    Object[] expandVariables(String[] args) throws Exception;

    Object execute(ParsedLine parsedLine) throws Exception;

}
