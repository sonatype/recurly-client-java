package com.kwanzoo.recurly.exception;

import com.sun.jersey.api.client.ClientResponse;

public class PreconditionFailedException
    extends Base
{
    private static final long serialVersionUID = 1L;

    public PreconditionFailedException( final ClientResponse response )
    {
        super( response );
    }
}
