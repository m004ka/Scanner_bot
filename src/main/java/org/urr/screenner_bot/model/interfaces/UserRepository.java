package org.urr.screenner_bot.model.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.urr.screenner_bot.model.TelegramUser;
@Repository
public interface UserRepository extends JpaRepository<TelegramUser, Long> {
}
