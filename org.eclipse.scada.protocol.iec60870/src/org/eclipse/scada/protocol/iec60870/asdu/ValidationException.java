/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.protocol.iec60870.asdu;

public class ValidationException extends Exception
{
    private static final long serialVersionUID = 1L;

    public ValidationException ()
    {
    }

    public ValidationException ( final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace )
    {
        super ( message, cause, enableSuppression, writableStackTrace );
    }

    public ValidationException ( final String message, final Throwable cause )
    {
        super ( message, cause );
    }

    public ValidationException ( final String message )
    {
        super ( message );
    }

    public ValidationException ( final Throwable cause )
    {
        super ( cause );
    }

}
