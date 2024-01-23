package musicStreaming.playList.playListTasks;

import musicStreaming._global.logger.CustomLogger;
import musicStreaming._global.logger.CustomLoggerType;

import musicStreaming.domain.playList.PlayList;
import musicStreaming.domain.playList.PlayListRepository;

import musicStreaming.playList.reqDtos.UpdatePlayListReqDto;
import musicStreaming.playList.resDtos.UpdatePlayListResDto;

public class UpdatePlayListTask {
    // 주어진 DataURL을 저장하고, File 서비스에 업로드 요청을 수행하기 위해서
    public static UpdatePlayListResDto updatePlayListTask(UpdatePlayListReqDto updatePlayListReqDto,
            PlayListRepository playListRepository) {
        CustomLogger.debug(CustomLoggerType.EFFECT, "TODO: updatePlayList");

        // [1] playListRepository로 playListId와 매칭되는 PlayList 데이터를 가져옵니다.
        // [2] PlayList를 수정하고 저장합니다.
        // [3] PlayListUpdated 이벤트를 발생시킵니다.

        return new UpdatePlayListResDto(new PlayList());
    }
}