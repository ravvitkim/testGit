package view;

import dto.GirlDto;
import service.GirlGroupService;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    GirlGroupService girlGroupService = new GirlGroupService();

    public void insertView() {
        System.out.println("=== 걸그룹 등록 ===");

    }

    public void updateView() {
        System.out.println("=== 걸그룹 수정 ===");
    }

    public void deleteView() {
        System.out.println("=== 걸그룹 삭제 ===");
    }

    public void findAllView() {
        System.out.println("=== 걸그룹 목록 ===");
        List<GirlDto> girlDtos = new ArrayList<>();
        girlDtos = girlGroupService.getListAll();

    }

    public void searchView() {
        System.out.println("=== 걸그룹 검색 ===");
    }
}
