That error message is a classic "handshake" mismatch. It means you are trying to talk HTTPS to a port that only understands HTTP.

The gibberish characters you see (like 0x160x030x01) are actually encrypted TLS handshake packets. Because the server is expecting a standard HTTP method (like GET or POST), it tries to read those bytes as text, fails, and throws that IllegalArgumentException.

Why this is happening
In your web.xml, you have this setting:

XML
<user-data-constraint>
    <transport-guarantee>CONFIDENTIAL</transport-guarantee>
</user-data-constraint>
By setting it to CONFIDENTIAL, you are telling Tomcat: "Do not allow anyone to access this resource unless the connection is encrypted (HTTPS)."

You are likely accessing the site via http://localhost:8080/calc.

Tomcat sees the CONFIDENTIAL constraint and tries to redirect you to the secure port (usually 8443).

If your Tomcat is not properly configured with an SSL Certificate and an HTTPS Connector, or if you are manually typing https:// into a port only configured for http://, the communication breaks.

How to Fix It
Option A: Disable Secure Transport (For Local Testing)
If you just want to get the login prompt working and don't care about encryption yet, change CONFIDENTIAL to NONE.

XML
<user-data-constraint>
    <transport-guarantee>NONE</transport-guarantee>
</user-data-constraint>
After this change, restart Tomcat and try accessing the URL again.

Option B: Configure HTTPS in Tomcat
If you actually need encryption, you must edit your conf/server.xml and uncomment/configure the SSL Connector. You will need a keystore file for this.

Option C: Check the URL
If you are typing https://localhost:8080, stop!

8080 is typically the HTTP (unsecured) port.

8443 is typically the HTTPS (secured) port.
Try accessing the plain http:// version and let Tomcat handle the redirect, or ensure your browser isn't forcing "HTTPS Only" mode on a port that doesn't support it.