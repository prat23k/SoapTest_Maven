package Lib

public class SoapAssertions {


    public log
    public context
    public testRunner
    public request
    public response
    public requestN

    public SoapAssertions(log,context,testRunner,requestName)

    {

        this.log = log;
        this.context = context;
        this.testRunner = testRunner;
        this.requestN = requestName;

        request = context.expand('${'+requestName+'#Request}');
        response = context.expand('${'+requestName+'#Request}');

        log.info request;
        log.info response;

    }


    // Response Validations
    public void responseValidate(){

        def request2 = testRunner.testCase.testSteps[requestN].testRequest.response.getResponseHeaders()["#status#"].toString();
        log.info "Response Status Validation"
        assert request2.contains("200"),"status code is valid";

    }




}
