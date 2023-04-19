package top.moon.imiao.pojo.constant;

/**
 * OwnerTypeEnum: 拥有者类型枚举类
 *
 * @author xingzhanqi
 * @date 2023/04/15 14:47
 */
public enum OwnerTypeEnum {
    /**
     * 野生
     */
    WILD(1),
    /**
     * 客户
     */
    CUSTOMER(2),
    /**
     * 商家
     */
    SHOP(3);

    private Integer value;

    OwnerTypeEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
