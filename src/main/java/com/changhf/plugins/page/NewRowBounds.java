package com.changhf.plugins.page;

import org.apache.ibatis.session.RowBounds;

/**
 * 扩展原RowBounds，加入排序实现
 *
 * @author <a href="mailto:wb-chf309549@alibaba-inc.com">常华锋</a>
 * @version V1.0.0
 * @since 2018/4/3
 */
public class NewRowBounds extends RowBounds {

    private String orderBy;
    private String order;
    public final static NewRowBounds DEFAULT = new NewRowBounds();

    public NewRowBounds() {
        super();
    }

    @SuppressWarnings("rawtypes")
    public NewRowBounds(Page page) {
        super(page.getFirst(), page.getPageSize());
        this.orderBy = page.getOrderBy();
        this.order = page.getOrder();
    }

    public NewRowBounds(int offset, int limit, String orderBy, String order) {
        super(offset, limit);
        this.orderBy = orderBy;
        this.order = order;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getOrder() {
        return order;
    }

}
