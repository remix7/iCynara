package com.icynara.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icynara.base.DaoSupportImpl;
import com.icynara.domain.Reply;
import com.icynara.service.ReplyService;
@Service
@Transactional
public class ReplyServiceImpl extends DaoSupportImpl<Reply> implements ReplyService{

}
