package board.spring.dto.response;

import board.spring.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardListResponse {
    private String title;
    private String content;

    public static BoardListResponse from(Board board){
        return new BoardListResponse(board.getTitle(), board.getContent());
    }

}

