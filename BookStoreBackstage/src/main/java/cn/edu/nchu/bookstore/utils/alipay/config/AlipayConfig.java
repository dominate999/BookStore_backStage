package cn.edu.nchu.bookstore.utils.alipay.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Component;

@Configuration
@Component
public class AlipayConfig {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    private String appId = "2021000117693351";

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥
     */
    private String privateKey =
            "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC2BSpY8MPtyiDx6dm7xR9K3nXVz8+k7JIwxxr7d2M18xkW2aeuvwnbyH7l93ZSbc4FsT5dkIaYHacaELoA3sy64WsebQh+Gs/w4nXOBb7xYeXbhU5396nqUBOf7eQUAAl7MZg0KDZN+PnoiTkj/xeldk1Ma7+3YmJy4/yA/VgGxofuncV8VbGhN8+CR2wAqfcCuZ/qowOMVIXiWkdVijRvpyX8rUEFalEY/LFBOTpJDr6xnfkjQWv40VELuM6P6tsxKBNVoD9qhIbbKxixZLKs7sSBVclRU2fQ+PCFkPa8AEFEtGK/kdv5kreSAnguZqbh/7KKXZt1fgT2KTCTQodBAgMBAAECggEATz/UfkDlrYSR74H3sM9Uno5ZE6yVJaNyyxYFY3NJmNWtGMvPPEAlFLIovguOUrlIOCZBlw8z6ssOVETwFyzqSnuW3fpu9ijKXIDc9cR+rC4JnBhgX89PBZuzz7AN279gYWjocd0IN86tUFder5ODQiFN6nYHVNrbLlahO7ASQXA0j84Q3daQbumaiYED8VazTUyMqhga2x655HKKmuX3CJfGH98s6TZg9Q7Etf1RXepQkFgxuxVfUhJ4rT0iFGBljRtFG2cWQLN7xW87gnZSGNEQZsfJQKt4hfTchg6Suo2CIwqvC9sSfb1DPZvC2A2/cOpLLeCKavwE4Myu99+CWQKBgQD94A1p1x3j91ZJEfUiuVhUbRFMXK7EMZXty5bh1Gnt7H7fJTNx46Bc/HzRGAFDsM42G9mMnmLX4BZr8Tz7b62G8al2shhYfef1++F3skcwnmWP/Nq83Qo/ofUlxgRtMvJAKaCzWR929RDNFmMWeqHGCtTysecY6Chq/djct6pE9wKBgQC3iyhw7V+5qUnah7AZkEoTO+MzCPxeC3lOHYGR/crdbh7LzmcWRkY/J/fGtddzb0EIGoZEVQEUiowuZ8AIukMpUEze3LunelmGVMXOs46C3zn5QGIkjFwF2EyjaGfMwnQvt9LxtuwjX3u3djHVHdPrYqTtBpkjZuU9jbcgxIPfhwKBgEg69NYGJDT17BDCETKd9SmgFmnZfMfJK9UKNZVu7+yHetlWJjri/n82PvTmlYWCykjOx6igb5Ln6LkxW55V+dMI8qQYq6CRwetUjKOXj3Wfu1mqITnW0dGk7LCglCXVduMWdOhSFQetVehj1DFTFq/X6Rpbz1pgww8dxhOWFdWlAoGAMDqz3MCzR7ERRAgloQIGRPmWoQF6dyfir0EXnAopdXgLRZiuA+9hZBUXibKcs6uHVh7KK0h+6Svi3ArNLj3rif6cxG8SLFb9EUxTUhZim0cXD8T4RQxQ3gRRVxsHM4nhR+yw1G0xrbXYZ4P6YjrdRdv85H+4W9Ic6MjFVynsUR8CgYAd9d/4XAj9NNyZO9UX7x0JBHOBKDWg36UxC3M44P5BAaKXRvj/z2lxgJFQDzW7xYXJD9ElxuRwQFVK9h21jphcNeUxNhshOr4kO5Fd+J6WMfuHmtQikpq3gy7/XCwqvR55MxoGKUYacTI1mOhzH8wc5PCk+RoW4gUgal/M3nmrWA==";

    /**
     * 支付宝公钥,
     */
    private String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnThotUv2cIuFgBWE+FzGbU0vxpJ+f+xfHbIGqEfJ4dSZPttTj16BeZv8JpP8dj06Imm8uN8GLLrMBc63XlRbTjfpCmnhUIHEj06ADCKhpWc2KzF4a6CSMfUpKaXFkKWMTWXreEID2EGrY2OgmFHzkTzHiERoz2WgY36uoLQVlem1BU7J/Ky/U8BOgSS0vMwTHOuCUw4MtHuFcsBbu8Sbjt7Xr1IKHkYbcToCHfb9rcXEbvPBEYJpyC/degUc+1KTJYAyyWvuEJSBg4vMuTkmxMvYmKJtMpUu1SQXBfCPtdAz0s9+wqj5me86xzBFcefvlbdPbs1HErP+bMfOH8SkNQIDAQAB";

    /**
     * 服务器异步通知页面路径需http://格式的完整路径，不能加?id=123这类自定义参数
     */
    private String notifyUrl = "http://localhost:8081/#/success";

    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数
     */
    private String returnUrl = "http://localhost:8081/#/success";

    /**
     * 签名方式
     */
    private String signType = "RSA2";

    /**
     * 字符编码格式
     */
    private String charset = "utf-8";

    /**
     * 支付宝网关
     */
    private String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    /**
     * 支付宝网关
     */
    private String logPath = "C:\\";


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }
}
