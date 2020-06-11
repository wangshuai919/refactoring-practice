refactoring-practice
----

#### ParkingLot 用户故事(#1):
    作 为:  一个停⻋场小弟 
    我希望:能实现停⻋、取⻋功能 
    以便于:更好的服务⻋主
----

#### 存车
- Given 一个停车场，一辆汽车，When 泊车，Then 得到泊车凭证
- Given 停车场已满，When 泊车，Then '无法停车'

#### 取车
- Given 一个有效的停车Token，When 取车，Then 取到存放的车 
- Given 停车场是满的，一个有效的Token，When 取车，Then 可以进行泊车
- Given 停车场是满的，一个使用过的Token，When 取车，Then '车辆不存在'
- Given 一个停车场，一个无效的Token，When 取车，Then '车辆不存在'




---
#### ParkingLot 用户故事(#2):
    作 为:  一个停⻋场小弟,我管理着两个停车场 
    我希望: 按顺序把车存放到停车场
    以便于: 更好的服务⻋主
----
#### 存车
- Given 一个停车场小弟，管理两个停车场，两个停车场都可未停满，停一辆车
  When 取车，Then 取到一辆车
- Given 一个停车场小弟，管理两个停车场，两个停车场都可未停满，
  When 停车，Then 车辆存在第一个停车场
- Given 一个停车场小弟，管理两个停车场，第一个停车场满，第二个未满，
  When 停车，Then 车辆存在第二个停车场
- Given 一个停车场小弟，管理两个停车场，两个停车场都停满，
  When 停车，Then '无法停车'
#### 取车
- Given 一个有效的停车Token，When 取车，Then 取到存放的车
- Given 一个使用过的停车Token，When 取车，Then '车辆不存在'
- Given 一个无效的Token，When 取车，Then '车辆不存在'


---
#### ParkingLot 用户故事(#3):
    作 为:  一个停⻋场小弟,我管理着两个停车场 
    我希望: 按顺序把车存放到空位较多的那个停车场
    以便于: 更好的服务⻋主
----  