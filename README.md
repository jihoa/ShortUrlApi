https://developers.naver.com/docs/utils/shortenurl/

단축 URL 요청(JSON)
설명
원본 URL을 https://me2.do/example과 같은 형태로 변환한 단축 URL 정보를 JSON 형식으로 반환합니다.

요청 URL
https://openapi.naver.com/v1/util/shorturl
또는

https://openapi.naver.com/v1/util/shorturl.json
프로토콜
HTTP

HTTP 메서드
GET
POST
파라미터
**파라미터	타입	필수 여부	설명
url	String	Y	단축할 원본 URL**
참고 사항
API를 요청할 때 다음 예와 같이 HTTP 요청 헤더에 클라이언트 아이디와 클라이언트 시크릿을 추가해야 합니다.

> POST /v1/util/shorturl HTTP/1.1
> Host: openapi.naver.com
> User-Agent: curl/7.49.1
> Accept: */*
> Content-Type: application/x-www-form-urlencoded; charset=UTF-8
> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
> Content-Length: 42

응답에 성공하면 결괏값을 JSON 형식으로 반환합니다.

속성	타입	설명
**message	string	오류 메시지. 응답에 성공하면 ok를 반환합니다.
code	string	HTTP 상태 코드
result.hash	string	단축 URL의 해시 정보
result.url	string	단축된 URL
result.orgUrl	string	원본 URL**