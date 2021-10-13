# special_kai_chain_data
特殊改造链特例列表。用于列出需要在抓取/对应字幕时特殊处理的舰

特殊改造链的逻辑为抓取/对应台词时，如果发现有存在于这个文件内的船，则把平时使用的after_id更换成这个表里的new_after_ship_id

# New Entry/新特例船格式

拿山风改造链为例：
   "457":
    [
        {
            "chinese_name": "山风",
            "ship_id": 457,
            "new_after_ship_id": 369
        },
        {
            "chinese_name": "山风改",
            "ship_id": 369,
            "new_after_ship_id": 588
        },
        {
            "chinese_name": "山风改二",
            "ship_id": 588,
            "new_after_ship_id": 667
        },
        {
            "chinese_name": "山风改二丁",
            "ship_id": 667,
            "new_after_ship_id": 0
        }
    ]
    
    第一个ID为未改形态的ship_id。Array里面存有特列船从未改到改造链末端的item。内含 中文名，每个改造形态的ship_id, 以及下一个改造形态的ship_id。形态转换链最后一个new_after_ship_id要改成0。
    
    
