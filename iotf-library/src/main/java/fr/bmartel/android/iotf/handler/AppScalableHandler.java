/**
 * The MIT License (MIT)
 * <p/>
 * Copyright (c) 2016 Bertrand Martel
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.android.iotf.handler;

import android.content.Context;

import fr.bmartel.android.iotf.constant.MqttConst;

/**
 * Scalable Application Handler
 * <p/>
 * https://docs.internetofthings.ibmcloud.com/applications/mqtt.html
 *
 * @author Bertrand Martel
 */
public class AppScalableHandler extends AppHandlerAbstr {

    /**
     * Create a Scalable Application handler
     *
     * @param orgId               org_id is your unique organization ID, assigned when you sign up with the service. It will be a 6 character alphanumeric string
     * @param appId               app_id is a user-defined unique string identifier for this client
     * @param apiKey              api key generated on https://<your orgid>.internetofthings.ibmcloud.com/dashboard
     * @param authenticationToken authentication token used with api key above
     */
    public AppScalableHandler(Context context, String orgId, String appId, String apiKey, String authenticationToken) {
        super(context, orgId, appId, apiKey, authenticationToken);
    }

    @Override
    public void buildClientId() {
        mClientId = MqttConst.APPLICATION_SCALABLE_PREFIX + ":" + mOrgId + ":" + mAppId;
    }
}