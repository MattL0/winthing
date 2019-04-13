package com.fatico.winthing.systems.radeon;

import com.fatico.winthing.windows.SystemException;

@SuppressWarnings("serial")
public class AdlException extends SystemException {

    public AdlException(final String function, final int code) {
        super(function + " returned error code " + code + ".");
    }

}
