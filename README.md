# seoul-air

#### INTRODUCTION
By now, you should be getting comfortable with the technology stacks and tools introduced via learning resource. We will start a mini group project to exercise what you have been studying so far, and also put it in professional context.

#### PROJECT "SEOUL AIR" DESCRIPTION
The high level of air pullution and 미세먼지 is a serious health concern for Koreans. This is especially a concern for outdoor enthusiasts such as runners and cyclists. They would benefit from having information in easily-to-use format showing, such as, when is the best time / worst time to run in their particular area.
Luckily, the City of Seoul has hour-by-hour air pollution data via [서울열린데이터광장]( http://data.seoul.go.kr/dataList/catalogView.do?infId=OA-1200&srvType=S&currentPageNo=3&searchValue=&searchKey=nullhttp://data.seoul.go.kr/dataList/catalogView.do?infId=OA-1200&srvType=S&currentPageNo=3&searchValue=&searchKey=null)

Unfortunately, it's not in the format easily consummable by people. We want a clear, simple website (or ask Alexa/Google Assistant/Siri/et) to find information such as:
- When is the best/worst time of the day in terms air cleanliness in different neighbors?
- Historically, what is the air cleanliness ranking for various neighborhoods in Seoul?
- What, if any, has been the trend last 1/3/5 years?

(below needs other data set, and/or technology)

- What is the cause of the air pollution? Can you find correlation between the rate of pollution (daily and trending) with some possible source(s)?
- Utilizing all of the above, create a simple model that correctly tracks historical data, and models future pullution trend
####  PROJECT BREAKDOWN
Step1: By next meeting, submit a 1 to 3 pager (but not more please) that describes:
- The scope of the project considering your time limitation
- How you will achieve it including design, technology you will use
- Who will do what, including high level project plan

Step 2: By the following week meeting - beta version
- A working but limited functionality version is pushed to a live site
- Make use of https://heroku.com
- Track the team's progress using https://waffle.io
Link both of above to slack channels so team members are informed of status all within slack

Step 3: The released version!

####  How to run

- To run from console, `mvn`
- Above is also needed because that's what Heroku system would assume a Spring Boot app to have 
