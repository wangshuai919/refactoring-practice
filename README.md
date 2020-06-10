# refactoring-practice
----

#### ParkingLot 任务拆分
    用户故事:
        作为:一个停⻋场小弟 
        我希望:能实现停⻋、取⻋功能 
        以便于:更好的服务⻋主
----

#### 存车
- Given 一个停车场，一辆汽车，When 泊车，Then 返回泊车凭证
- Given 停车场已满，When 泊车，Then '无法停车'

#### 取车
- Given 停车场是满的，When 取车，Then 可以进行泊车
- Given 停车场是满的，从停车场取一辆车，When 取相同的车，Then '取车失败'
- Given 一个停车场，When 取一个未停放的车，Then '取车失败'
