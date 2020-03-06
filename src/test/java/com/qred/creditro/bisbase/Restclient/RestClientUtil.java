package com.qred.creditro.bisbase.Restclient;

public class RestClientUtil {

    
//    @Test
//    public void getTransactionById() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8080/transaction/7943f961-a733-43cf-ba3d-905a5856f6da";
//        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
//        ResponseEntity<Response> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Response.class, 1);
//        Response response = responseEntity.getBody();
//        System.out.println("account_id:" + response.getAccountId() + ", amount:" + response.getBalance()
//        );
//    }
//
//    @Test
//    public void getBlanace() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8080/balance/a40bcc03-6f39-418c-ad0b-97e14f522ec1";
//        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
//        ResponseEntity<Response> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Response.class);
//        Response response = responseEntity.getBody();
//        System.out.println("Balance:" + response.getBalance());
//
//    }
//    
//    @Ignore
//    @Test
//    public void addTransaction() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Transaction-Id", "7943f961-a733-43cf-ba3d-905a5856f6da");
//        headers.set("Content-Type", "application/json");
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8080/amount";
//        TransactionRequest request = new TransactionRequest();
//        request.setAccountId("a40bcc03-6f39-418c-ad0b-97e14f522ec1");
//        request.setAmount(100);
//        HttpEntity<TransactionRequest> requestEntity = new HttpEntity<TransactionRequest>(request, headers);
//        ResponseEntity<Object> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, Object.class);
//        System.out.println(responseEntity.getStatusCode());
//        
//    }
//    
//    @Test
//    public void getMaxTransactionVol() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Content-Type", "application/json");
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8080/max_transaction_volume";
//        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
//        ResponseEntity<Response> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Response.class);
//        Response response = responseEntity.getBody();
//        System.out.println("maxVolume : " + response.getMaxVolume()+ "accounts :"+response.getAccounts());
//
//    }

}
