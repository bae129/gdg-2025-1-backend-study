*웹
여러 컴퓨터가 서로 연결되어 정보를 공유하는 공간
웹에서 컴퓨터가 서로 정보를 주고 받는 일반적인 형태는 클라이언트-서버 패러다임
클라이언트: 데이터의 생성/조회/수정/삭제 요청을 전송
서버: 요청대로 동작을 수행하고 응답을 전송

*프로토콜과 HTTP
컴퓨터는 정해진 동작만 수행하므로 데이터 전송 방법을 명시해줘야 한다
이때 서로 다른 방법으로 데이터를 전송하면 혼란이 생긴다.
- 정해진 규칙이 필요하다
프로토콜: 네트워크 안에서 요청과 응답을 보내는 규칙
웹에서는 HTTP라는 프로토콜을 사용한다.
HTTP를 통해 요청을 보낼 땐 HTTP Method, URL이 필요하다
HTTP Method: 데이터를 다루는 방법 (동사)
URL(Uniform Resource Location): 다룰 데이터의 위치 (목적어)


*자주 사용하는 HTTP Method 
GET: 데이터를 가져온다. (조회)
POST: 데이터를 게시한다. (생성) (중복 가능)
PUT: 데이터를 교체한다. (수정) 없으면 생성, 있으면 교체. 중복으로 생성되지 않음
PATCH: 데이터를 수정한다. (수정) 기존 데이터에 수정해줌
DELETE: 데이터를 삭제한다. (삭제)

*URL 구조
http://.            www.example.com     
/user/1/nickname
프로토콜(scheme) / 서버 주소(domain)  
/ 서버 내 데이터 위치(path)

*Path Parameter
-	Path 경로 안에서 변할 수 있는 값 { } 로 표현
Query String
Path ?~~ => ~~ 부분이 Query string이다.
Key=value 를 &로 나열함

*HTTP Method, URL은 편지 봉투 겉면에 적는 받는 주소와 같은 개념
따라서 편지 봉투 속에 담을 내용에 대한 규칙도 필요하다

*HTTP로 주고받는 데이터의 구조
-	HTTP 헤더
-	통신에 대한 정보 
-	(언제 보냈는지, 누가 보내는지, HTTP method 종류, 요청 경로 등)
-	HTTP 바디
-	주고 받으려는 데이터
-	(보통 json 형식)

응답을 보낼 땐 요청에 대한 처리 결과를 나타내는 상태 코드를 함께 응답한다.
상태코드는 응답 데이터의 HTTP 헤더에 들어간다.


*대표적인 상태 코드
200 – 처리 성공 (ok)
201 – 데이터 생성 성공 (created)
400 – 클라이언트 요청 오류 (bad request)
404 – 요청 데이터 없음 (not found)
500 – 서버 에러 (internal server error) 

*프론트엔드와 백엔드
자주 변하지 않는 화면 UI와, 자주 변하는 컨텐츠를 분리
+	프론트엔드와 백엔드의 분리
-	프론트는 화면에 채울 컨텐츠 데이터를 백엔드에게 요청
-	백엔드는 DB에서 가져온 컨텐츠 데이터를 프론트에게 응답
프론트(클라이언트) -> GET 분야별 신간 도서 데이터 > 백엔드(서버)
프론트(클라이언트) < 200 OK 분야별 신간 도서 데이터 <- 백엔드(서버)

*API
-	프론트와 백엔드 모두 웹에서 동작하는 컴퓨터 프로그램(어플리케이션)
	HTTP를 사용하여 서로 데이터를 주고 받는다. 
-	HTTP는 웹에서 데이터를 주고받는 단순한 규칙
	구체적인 통신 방법은 규칙 안에서 직접 정의한다.
-	Application Programming Interface
-	어플리케이션에서 원하는 기능을 수행하기 위해 어플리케이션과 소통하는 방법(창구)을 정의한 것
*백엔드 API
프론트가 백엔드에 요청을 보낼 때
-	어떤 http method, url을 사용해야 하는지 정의한 것
-	각 요청에 대해 어떤 응답을 보내는지 정의한 것

*REST API
REST 아키텍처를 따르도록 설계한 API
URL : 조작할 데이터 (명사)
HTTP method : 데이터에 대한 행위 (동사)


<API 설계하기>
유저 회원가입 : POST /signup
로그인 : POST /login
나의 할 일 생성 : POST /todo
나의 할 일 조회 : GET /todo/list
나의 할 일 수정 : PATCH /todo/{todo_id}
나의 할 일 삭제 : DELETE /todo/{todo_id}
나의 할 일 체크 : POST /todo/{todo_id}/check
체크 해제 : POST /todo/{todo_id}/uncheck
친구 찾기 : GET /user/search?username={username}
팔로우 : POST /follow/{user_id}
언팔로우 : DELETE /unfollow/{user_id}
나의 친구 리스트 조회 : GET /friends
특정 친구의 할 일 조회 : GET /freiend/{friend_id}/todo

