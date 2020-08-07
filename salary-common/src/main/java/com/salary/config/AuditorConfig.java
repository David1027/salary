package com.salary.config;

import com.salary.utils.SecurityUtils;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Spring Data 开启审计功能
 * 设置创建人，更新人，创建时间，更新时间
 *
 * @author lingjian
 * @date 2020/8/7 15:12
 */
@Component("auditorAware")
public class AuditorConfig implements AuditorAware<String> {
    /**
     * 获取操作员信息
     *
     * @return Optional<String> 操作者信息
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        try {
            // 返回系统用户名称
            return Optional.of(SecurityUtils.getCurrentUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 没有token，没有操作员的情况下
        return Optional.of("system");
    }
}
