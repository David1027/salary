package com.salary.config;

import com.salary.utils.SecurityUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 返回当前用户是否拥有访问的权限
 *
 * @author lingjian
 * @date 2020/8/7 15:26
 */
@Service(value = "el")
public class ElPermissionConfig {

    /**
     * 校验用户是否拥有权限
     *
     * @param permissions 校验参数
     * @return Boolean
     */
    public Boolean check(String... permissions) {
        // 获取当前用户的所有权限
        List<String> elPermissions = SecurityUtils.getCurrentUser().getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
        // 放行admin用户 || 校验当前用户的所有权限是否包含接口上定义的权限
        return elPermissions.contains("admin") || Arrays.stream(permissions).anyMatch(elPermissions::contains);
    }
}
