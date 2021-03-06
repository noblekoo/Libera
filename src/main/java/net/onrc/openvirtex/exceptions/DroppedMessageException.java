/*
 *
 *  ******************************************************************************
 *   Copyright 2019 Korea University & Open Networking Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *   ******************************************************************************
 *   Developed by Libera team, Operating Systems Lab of Korea University
 *   ******************************************************************************
 *
 */
/**
 *
 */
package net.onrc.openvirtex.exceptions;

public class DroppedMessageException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 2086213976572923879L;

    public DroppedMessageException() {
        super();
    }

    public DroppedMessageException(final String msg) {
        super(msg);
    }

    public DroppedMessageException(final Throwable msg) {
        super(msg);
    }
}
