package usuario.dao;

import usuario.bean.UsuarioBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class UsuarioDaoImpl extends BaseDaoImpl<UsuarioBean> implements UsuarioDao {

    public UsuarioDaoImpl() {
        super(UsuarioBean.class);
    }
    
}
