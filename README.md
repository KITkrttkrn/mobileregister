# mobileregister
 
## Description
- API นี้เป็นระบบการสมัครสมาชิกโดยมีการวัดระดับสมาชิกจากเงินเดือน และเรียกดูข้อมูลด้วย Reference code ที่สร้างขึ้น

## Installation guide
- สามาร clone git ตัวนี้แล้วทำการ build ผ่าน Intellij ได้เลย

## Usage
- การใช้งานต่างๆ จะมี End Point ให้สามารถใช้งานได้โดยแบ่งกลุ่มการ Authentication ดังนี้
1. Unauthentication End Point
   - /authentication เป็นพาธสำหรับ authen เพื่อขอ JWT token โดยสามารถส่ง Param Body ไปด้วยดังนี้ { "username": "Krittikarn", "password": "Verakalas" }
2. Authentication End Point
   - /registration เป็นพาธสำหรับ สมัครสมัครชิกเมื่อส่งข้อมูลเข้าไปแล้วจะได้รับประเภทของ Member และ referencecode สำหรับค้นหาข้อมูล โดยมี Param Body ดังนี้ 
{
    "firstname": "",
    "lastname": "",
    "birthdate": "",
    "tel": "",
    "salary": 
}

   - /getmember เป็นพาธสำหรับ เรียกดูข้อมูลของสมาชิกทั้งหมด
   - /getmember/{refcode} เป็นพาธสำหรับ เรียกดูข้อมูลของสมาชิกตาม referencecode ที่ได้ไป
