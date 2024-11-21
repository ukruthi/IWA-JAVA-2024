/*
        Insecure Web App (IWA)

        Copyright 2020-2023 Open Text or one of its affiliates.

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.microfocus.example.repository;

import com.microfocus.example.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Implementation of Custom Refresh Token Repository
 * @author Kevin A. Lee
 */
@Transactional
public class RefreshTokenRepositoryImpl implements RefreshTokenRepositoryCustom {

    private static final Logger log = LoggerFactory.getLogger(RefreshTokenRepositoryImpl.class);

    private final RefreshTokenRepositoryBasic refreshTokenRepositoryBasic;

    @PersistenceContext
    EntityManager entityManager;

    public RefreshTokenRepositoryImpl(RefreshTokenRepositoryBasic refreshTokenRepositoryBasic) {
        this.refreshTokenRepositoryBasic = refreshTokenRepositoryBasic;
    }

    @SuppressWarnings("unchecked")
    public int deleteByUser(User user) {
        Query query = entityManager.createQuery(
                "DELETE FROM RefreshToken rt WHERE rt.user.id = ?1",
                Long.class);
        query.setParameter(1, user.getId());
        return (int)(query.getFirstResult());
    }

}
