package com.x.attendance.assemble.control.jaxrs.attendanceimportfileinfo;

import com.x.base.core.project.exception.PromptException;

class ExceptionAttendanceImportFileProcess extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionAttendanceImportFileProcess( Throwable e, String message ) {
		super("用户在进行导入文件信息处理时发生异常！message:" + message, e );
	}
}
