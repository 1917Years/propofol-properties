package propofol.ptfservice.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import propofol.ptfservice.api.controller.dto.BoardResponseDto;
import propofol.ptfservice.api.feign.dto.BoardDto;

import java.util.List;

@FeignClient("til-service")
public interface TilServiceFeignClient {

    @GetMapping("/portfolio/myBoards")
    List<BoardDto> getTagsByTagId (@RequestHeader("Authorization") String token);
}
