## FLOW 

- เมื่อเปิดเข้าเว็บไซต์มาจะแสดงสินค้าเป็น อาหารสัตว์ หลายยี่ห้อรวมกันอยู่ `10 ชิ้น`
- โดยเราจะเป็น`สมาชิกเว็บไซต์`อยู่แล้วและมี Wallet ในระบบ `1,000 wallet`
- มีข้อมูลส่วนตัว `ชื่อ,เบอร์โทรศัพท์,ที่อยู่` ที่เคยกรอกไว้แล้วตอนสมัครสมาชิก
- สินค้าที่เรากำลังหาอยู่คืออาหารแมว ยี่ห้อ canagan ได้ค้นหาว่า `canagan` 
- เจออาหารแมวยี่ห้อ canagan `3 ชิ้น` 3 รสชาติ (ปลา,ไก่,ไก่ง่วง)
- กดเข้าไปดูรายละเอียดสินค้า `canagan รสชาติไก่`
- เว็บเปลี่ยนหน้าและได้แสดงรายละเอียกสินค้าคือ `ชื่อ,รายละเอียด,รูป,ราคา`
- ได้เพิ่มสินค้าเข้าไปใน `ตะกร้าสินค้า` 
- และได้กดเข้าไปดูตะกร้าสินค้า ได้โชว์รายละเอียดสินค้าที่เพิ่มเข้ามา
` จำนวนสินค้า,มูลค่ารวม,[สินค้า (list) ชื่อ,รูป,ราคา,จำนวนที่ซื้อ] `
- ได้กดชำระเงิน โดย  `ที่อยุจัดส่ง` จะเอามาจากตอนสมัคร
- และการชำระเงินก็ `ตัดเงินจาก wallet`
- ยืนยันการชำระ 
- ระบบได้โชว์ประวัติคำสั่งซื้อ
` รหัสคำสั่งซื้อ, ชื่อคนชำระเงิน, วันที่ทำรายการ, ราคารวม`



## API Design
https://www.tablesgenerator.com/markdown_tables

| Method | Url | Description | Sample Valid Request Body | Sample Valid Response Body |
|:------:|:---:|:-----------:|:-------------------------:|:--------------------------:|
|   GET  |     |             |                           |                            |
|  POST  |     |             |                           |                            |
|        |     |             |                           |                            |