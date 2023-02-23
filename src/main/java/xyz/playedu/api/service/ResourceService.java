package xyz.playedu.api.service;

import xyz.playedu.api.domain.Resource;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.playedu.api.types.paginate.PaginationResult;
import xyz.playedu.api.types.paginate.ResourcePaginateFilter;

/**
 * @author tengteng
 * @description 针对表【resources】的数据库操作Service
 * @createDate 2023-02-23 10:50:26
 */
public interface ResourceService extends IService<Resource> {

    PaginationResult<Resource> paginate(int page, int size, ResourcePaginateFilter filter);

}