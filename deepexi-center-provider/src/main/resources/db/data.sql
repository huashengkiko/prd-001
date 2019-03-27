DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);
CREATE TABLE IF NOT EXISTS hsp_member_count_info(
    id varcahr(32) not null primary key,    account_id varchar(255)  ,    type_id varchar(255) not null ,    name varchar(255)  ,    type varchar(255)  ,    product_item_name varchar(255)  ,    product_item_id varchar(255)  ,    push_date datetime  ,    push tinyint  ,    look_date datetime  ,    look tinyint  ,    partake_date datetime  ,    partake tinyint  ,    payment_date datetime  ,    payment tinyint  ,    share_date datetime  ,    share tinyint  ,    push_id varchar(255)  ,    push_type varchar(255)  ,    pay_id varchar(255)  ,    order_id varchar(255)  ,    tenant_code varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    version int   ,    dr tinyint  ,    remark1 varchar(255)  ,    remark2 varchar(255)  ,    remark3 varchar(255)  ,    remark4 varchar(255)  );
CREATE TABLE IF NOT EXISTS hsp_member_share_info(
    id varcahr(32) not null primary key,    account_id varchar(255)  ,    type_id varchar(255)  ,    type int   ,    title varchar(255)  ,    channel int   ,    share_num int   ,    be_share_num int   ,    browse_num int   ,    register_num int   ,    paid_member_num int   ,    tenant_code varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    version int   ,    dr tinyint  ,    remark1 varchar(255)  ,    remark2 varchar(255)  ,    remark3 varchar(255)  ,    remark4 varchar(255)  );
CREATE TABLE IF NOT EXISTS hsp_timetype_count(
    id varcahr(32) not null primary key,    count_daily int   ,    count_weekly int   ,    count_permonth int   ,    count_type varchar(255)  ,    time_type datetime  ,    tenant_code varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    version int   ,    dr tinyint  ,    remark1 varchar(255)  ,    remark2 varchar(255)  ,    remark3 varchar(255)  ,    remark4 varchar(255)  );
